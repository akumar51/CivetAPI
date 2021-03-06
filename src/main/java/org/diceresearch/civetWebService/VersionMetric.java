package org.diceresearch.civetWebService;


import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.DCAT;
import org.apache.jena.vocabulary.DCTerms;
import org.apache.jena.vocabulary.OWL;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dice_research.opal.civet.Metric;
import org.dice_research.opal.common.vocabulary.Opal;

/**
 * The VersionMetric awards stars based on the version given in
 * datasets.
 * Version numbering
 * For different states of data, a version number can be given in the metadata to provide
 * an identification of the current version.
 * metadata contains a dedicated field for the version or extracted it out of description texts inside the metadata.
 * Implementation -
 * - Uses downloadUrl with accessUrl to get the version .
 * - Uses ConformTo property to get version Number https://www.w3.org/TR/vocab-dcat/#Property:resource_conforms_to
 * - Uses Version Info to get the Version number https://www.w3.org/2002/07/owl#versionInfo
 *
 * * @author Vikrant Singh, Adrian Wilke
 */

public class VersionMetric implements Metric {

    private static final Logger LOGGER = LogManager.getLogger();
    private static final String DESCRIPTION = "Computes if Version Number is there "
            + "If Version Number is given as a property VersionInfo," +
            "5 stars are awarded. "
            + "If the version number is given in the property conformsTo ," +
            "4 stars are awarded"
            + "If the version number is given in the property download or access url ," +
            "3 stars are awarded "
            + "Else null is returned";

    @Override
    public Integer compute(Model model, String datasetUri) throws Exception {

        LOGGER.info("Processing dataset " + datasetUri);

        Resource dataset = ResourceFactory.createResource(datasetUri);
        Statement versionInfoAsProperty = model.getProperty(dataset, OWL.versionInfo);

        //checks if the version information is given
        // directly in a property version info
        String versionInfoAsPropertyValue = "";
        if(versionInfoAsProperty != null)
            versionInfoAsPropertyValue = versionInfoAsProperty.
                    getObject().toString();

        boolean versionInfoAsPropertyFound = false;
        if(!versionInfoAsPropertyValue.equals(""))
            versionInfoAsPropertyFound = true;

        //checks if the version info is given in the access and download url
        StmtIterator iter = model.listStatements
                (dataset, DCAT.distribution ,(RDFNode) null);
        boolean versionStringFound = false;
        String downloadUrl = "";
        String accessUrl = "";
        while (iter.hasNext()) {
            Statement stmt = iter.nextStatement();
            RDFNode object = null ;

            object = stmt.getObject();

            if (object.isURIResource())
            {
                Resource distributionURI = (Resource) object;
                Statement statementAccessUrl = model.getProperty(distributionURI,
                        DCAT.accessURL);
                Statement statementDownloadUrl = model.getProperty(distributionURI,
                        DCAT.downloadURL);

                if (statementAccessUrl != null)
                    accessUrl = String.valueOf(statementAccessUrl.getObject());

                if (statementDownloadUrl != null)
                    downloadUrl = String.valueOf(statementDownloadUrl.getObject());

                if (accessUrl.toLowerCase().contains("version") ||
                        downloadUrl.toLowerCase().contains("version"))
                    versionStringFound = true;
            }
        }

        // checks if the version information is given in property conforms to
        StmtIterator conformsToItr = model.listStatements
                (dataset,DCTerms.conformsTo,(RDFNode) null);

        boolean versionInfoFound = false;
        if(conformsToItr.hasNext())
        {
            Statement statementConformsTo = conformsToItr.nextStatement();
            RDFNode object = statementConformsTo.getObject();
            Resource objectAsResource = (Resource) object ;
            if(objectAsResource.hasProperty(OWL.versionInfo))
            {
                String versionInfo = objectAsResource.getProperty
                        (OWL.versionInfo).getObject().toString();

                if(!versionInfo.equals(""))
                    versionInfoFound =  true ;
            }
        }

        if(versionInfoAsPropertyFound)
            return 5;
        else if (versionInfoFound)
            return 4;
        else if (versionStringFound)
            return 3;

        return null;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public String getUri() throws Exception {
        return Opal.OPAL_METRIC_VERSION_NUMBERING.getURI();
    }
}