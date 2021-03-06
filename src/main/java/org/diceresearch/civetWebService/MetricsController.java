package org.diceresearch.civetWebService;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.dice_research.opal.civet.Civet;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * This is a spring boot rest controller for reading RDF model and datasetUri
 * sent from postman and the returned result will be evaluated metric star.
 *
 * @author Aamir Mohammed
 *
 */

@RestController
public class MetricsController {

	@PostMapping("/uploadFile/DateFormat")
	public int uploadFileDateFormat(@RequestParam("file") MultipartFile file, @RequestParam String dataSet)
			throws Exception {

		/* Creating a Default model to Load the turtle file */
		Model model = ModelFactory.createDefaultModel();

		/* Reading the turtle file */
		model.read(new ByteArrayInputStream(file.getBytes()), null, "TTL");

		/* Reading the datasetUri */
		String datasetUri = new String(dataSet.getBytes(), StandardCharsets.UTF_8);

		/* If existing measurements should be removed */
		Civet civet = new Civet();
		civet.setRemoveMeasurements(true);

		/* If it should be logged, if a measurement could not be computed */
		civet.setLogNotComputed(true);

		/* Compute model and datasetUri */
		DateFormatMetric metric = new DateFormatMetric();
		return metric.compute(model, datasetUri);
	}

	@PostMapping("/uploadFile/Description")
	public int uploadFileDescription(@RequestParam("file") MultipartFile file, @RequestParam String dataSet)
			throws Exception {

		/* Creating a Default model to Load the turtle file */
		Model model = ModelFactory.createDefaultModel();

		/* Reading the turtle file */
		model.read(new ByteArrayInputStream(file.getBytes()), null, "TTL");

		/* Reading the datasetUri */
		String datasetUri = new String(dataSet.getBytes(), StandardCharsets.UTF_8);

		/* If existing measurements should be removed */
		Civet civet = new Civet();
		civet.setRemoveMeasurements(true);

		/* If it should be logged, if a measurement could not be computed */
		civet.setLogNotComputed(true);

		/* Compute model and datasetUri */
		DescriptionMetric metric = new DescriptionMetric();
		return metric.compute(model, datasetUri);
	}

	@PostMapping("/uploadFile/ProviderIdentity")
	public int uploadFileProviderIdentity(@RequestParam("file") MultipartFile file, @RequestParam String dataSet)
			throws Exception {

		/* Creating a Default model to Load the turtle file */
		Model model = ModelFactory.createDefaultModel();

		/* Reading the turtle file */
		model.read(new ByteArrayInputStream(file.getBytes()), null, "TTL");

		/* Reading the datasetUri */
		String datasetUri = new String(dataSet.getBytes(), StandardCharsets.UTF_8);

		/* If existing measurements should be removed */
		Civet civet = new Civet();
		civet.setRemoveMeasurements(true);

		/* If it should be logged, if a measurement could not be computed */
		civet.setLogNotComputed(true);

		/* Compute model and datasetUri */
		ProviderIdentityMetric metric = new ProviderIdentityMetric();
		return metric.compute(model, datasetUri);
	}

	@PostMapping("/uploadFile/Licenses")
	public int uploadFileLicensesMetric(@RequestParam("file") MultipartFile file, @RequestParam String dataSet)
			throws Exception {

		/* Creating a Default model to Load the turtle file */
		Model model = ModelFactory.createDefaultModel();

		/* Reading the turtle file */
		model.read(new ByteArrayInputStream(file.getBytes()), null, "TTL");

		/* Reading the datasetUri */
		String datasetUri = new String(dataSet.getBytes(), StandardCharsets.UTF_8);

		/* If existing measurements should be removed */
		Civet civet = new Civet();
		civet.setRemoveMeasurements(true);

		/* If it should be logged, if a measurement could not be computed */
		civet.setLogNotComputed(true);

		/* Compute model and datasetUri */
		AvailabilityOfLicensesMetric metric = new AvailabilityOfLicensesMetric();
		return metric.compute(model, datasetUri);
	}

	@PostMapping("/uploadFile/DataFormat")
	public int uploadFileDataFormatMetric(@RequestParam("file") MultipartFile file, @RequestParam String dataSet)
			throws Exception {

		/* Creating a Default model to Load the turtle file */
		Model model = ModelFactory.createDefaultModel();

		/* Reading the turtle file */
		model.read(new ByteArrayInputStream(file.getBytes()), null, "TTL");

		/* Reading the datasetUri */
		String datasetUri = new String(dataSet.getBytes(), StandardCharsets.UTF_8);

		/* If existing measurements should be removed */
		Civet civet = new Civet();
		civet.setRemoveMeasurements(true);

		/* If it should be logged, if a measurement could not be computed */
		civet.setLogNotComputed(true);

		/* Compute model and datasetUri */
		DataFormatMetric metric = new DataFormatMetric();
		return metric.compute(model, datasetUri);
	}

	@PostMapping("/uploadFile/TimelinessMetric")
	public int uploadFileTimelinessMetric(@RequestParam("file") MultipartFile file, @RequestParam String dataSet)
			throws Exception {

		/* Creating a Default model to Load the turtle file */
		Model model = ModelFactory.createDefaultModel();

		/* Reading the turtle file */
		model.read(new ByteArrayInputStream(file.getBytes()), null, "TTL");

		/* Reading the datasetUri */
		String datasetUri = new String(dataSet.getBytes(), StandardCharsets.UTF_8);

		/* If existing measurements should be removed */
		Civet civet = new Civet();
		civet.setRemoveMeasurements(true);

		/* If it should be logged, if a measurement could not be computed */
		civet.setLogNotComputed(true);

		/* Compute model and datasetUri */
		TimelinessMetric metric = new TimelinessMetric();
		return metric.compute(model, datasetUri);
	}

	@PostMapping("/uploadFile/ReadabilityMetric")
	public int uploadFileReadabilityMetric(@RequestParam("file") MultipartFile file, @RequestParam String dataSet)
			throws Exception {

		/* Creating a Default model to Load the turtle file */
		Model model = ModelFactory.createDefaultModel();

		/* Reading the turtle file */
		model.read(new ByteArrayInputStream(file.getBytes()), null, "TTL");

		/* Reading the datasetUri */
		String datasetUri = new String(dataSet.getBytes(), StandardCharsets.UTF_8);

		/* If existing measurements should be removed */
		Civet civet = new Civet();
		civet.setRemoveMeasurements(true);

		/* If it should be logged, if a measurement could not be computed */
		civet.setLogNotComputed(true);

		/* Compute model and datasetUri */
		ReadabilityMetric metric = new ReadabilityMetric();
		return metric.compute(model, datasetUri);
	}

	@PostMapping("/uploadFile/UpdateRateMetric")
	public int uploadFileUpdateRateMetric(@RequestParam("file") MultipartFile file, @RequestParam String dataSet)
			throws Exception {

		/* Creating a Default model to Load the turtle file */
		Model model = ModelFactory.createDefaultModel();

		/* Reading the turtle file */
		model.read(new ByteArrayInputStream(file.getBytes()), null, "TTL");

		/* Reading the datasetUri */
		String datasetUri = new String(dataSet.getBytes(), StandardCharsets.UTF_8);

		/* If existing measurements should be removed */
		Civet civet = new Civet();
		civet.setRemoveMeasurements(true);

		/* If it should be logged, if a measurement could not be computed */
		civet.setLogNotComputed(true);

		/* Compute model and datasetUri */
		UpdateRateMetric metric = new UpdateRateMetric();
		return metric.compute(model, datasetUri);
	}

	@PostMapping("/uploadFile/VersionMetric")
	public int uploadFileVersionMetric(@RequestParam("file") MultipartFile file, @RequestParam String dataSet)
			throws Exception {

		/* Creating a Default model to Load the turtle file */
		Model model = ModelFactory.createDefaultModel();

		/* Reading the turtle file */
		model.read(new ByteArrayInputStream(file.getBytes()), null, "TTL");

		/* Reading the datasetUri */
		String datasetUri = new String(dataSet.getBytes(), StandardCharsets.UTF_8);

		/* If existing measurements should be removed */
		Civet civet = new Civet();
		civet.setRemoveMeasurements(true);

		/* If it should be logged, if a measurement could not be computed */
		civet.setLogNotComputed(true);

		/* Compute model and datasetUri */
		VersionMetric metric = new VersionMetric();
		return metric.compute(model, datasetUri);
	}

	@PostMapping("/uploadFile/AccessibilityMetric")
	public int uploadFileAccessibilityMetric(@RequestParam("file") MultipartFile file, @RequestParam String dataSet)
			throws Exception {

		/* Creating a Default model to Load the turtle file */
		Model model = ModelFactory.createDefaultModel();

		/* Reading the turtle file */
		model.read(new ByteArrayInputStream(file.getBytes()), null, "TTL");

		/* Reading the datasetUri */
		String datasetUri = new String(dataSet.getBytes(), StandardCharsets.UTF_8);

		/* If existing measurements should be removed */
		Civet civet = new Civet();
		civet.setRemoveMeasurements(true);

		/* If it should be logged, if a measurement could not be computed */
		civet.setLogNotComputed(true);

		/* Compute model and datasetUri */
		AccessibilityMetric metric = new AccessibilityMetric();
		return metric.compute(model, datasetUri);
	}


	@PostMapping("/uploadFile/ContactClassicMetric")
	public int uploadFileContactClassicMetric(@RequestParam("file") MultipartFile file, @RequestParam String dataSet)
			throws Exception {

		/* Creating a Default model to Load the turtle file */
		Model model = ModelFactory.createDefaultModel();

		/* Reading the turtle file */
		model.read(new ByteArrayInputStream(file.getBytes()), null, "TTL");

		/* Reading the datasetUri */
		String datasetUri = new String(dataSet.getBytes(), StandardCharsets.UTF_8);

		/* If existing measurements should be removed */
		Civet civet = new Civet();
		civet.setRemoveMeasurements(true);

		/* If it should be logged, if a measurement could not be computed */
		civet.setLogNotComputed(true);

		/* Compute model and datasetUri */
		ContactClassicMetric metric = new ContactClassicMetric();
		return metric.compute(model, datasetUri);
	}

	@PostMapping("/uploadFile/ContactEmailMetric")
	public int uploadFileContactEmailMetric(@RequestParam("file") MultipartFile file, @RequestParam String dataSet)
			throws Exception {

		/* Creating a Default model to Load the turtle file */
		Model model = ModelFactory.createDefaultModel();

		/* Reading the turtle file */
		model.read(new ByteArrayInputStream(file.getBytes()), null, "TTL");

		/* Reading the datasetUri */
		String datasetUri = new String(dataSet.getBytes(), StandardCharsets.UTF_8);

		/* If existing measurements should be removed */
		Civet civet = new Civet();
		civet.setRemoveMeasurements(true);

		/* If it should be logged, if a measurement could not be computed */
		civet.setLogNotComputed(true);

		/* Compute model and datasetUri */
		ContactEmailMetric metric = new ContactEmailMetric();
		return metric.compute(model, datasetUri);
	}

	@PostMapping("/uploadFile/ContactURLMetric")
	public int uploadFileContactURLMetric(@RequestParam("file") MultipartFile file, @RequestParam String dataSet)
			throws Exception {

		/* Creating a Default model to Load the turtle file */
		Model model = ModelFactory.createDefaultModel();

		/* Reading the turtle file */
		model.read(new ByteArrayInputStream(file.getBytes()), null, "TTL");

		/* Reading the datasetUri */
		String datasetUri = new String(dataSet.getBytes(), StandardCharsets.UTF_8);

		/* If existing measurements should be removed */
		Civet civet = new Civet();
		civet.setRemoveMeasurements(true);

		/* If it should be logged, if a measurement could not be computed */
		civet.setLogNotComputed(true);

		/* Compute model and datasetUri */
		ContactURLMetric metric = new ContactURLMetric();
		return metric.compute(model, datasetUri);
	}

}