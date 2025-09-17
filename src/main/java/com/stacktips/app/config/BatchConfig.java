package com.stacktips.app.config;

import jakarta.persistence.EntityManagerFactory;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.batch.item.database.JpaItemWriter;
import org.springframework.batch.item.database.builder.JpaItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.core.Job;

// Import the clean_foods class
import com.stacktips.app.model.clean_foods;

@Configuration
@EnableBatchProcessing
public class BatchConfig {
    @Bean
    public FlatFileItemReader<clean_foods> reader() {
        return new FlatFileItemReaderBuilder<clean_foods>()
            .linesToSkip(1)
            .name("cleanFoodItemReader")
            .resource(new ClassPathResource("clean_foods.csv"))
            .delimited()
            .delimiter(",")
            .names(
            "productName", "energy100g", "energyFromFat100g", "fat100g", "saturatedFat100g",
            "butyricAcid100g", "caproicAcid100g", "caprylicAcid100g", "capricAcid100g",
            "lauricAcid100g", "myristicAcid100g", "palmiticAcid100g", "stearicAcid100g",
            "arachidicAcid100g", "behenicAcid100g", "lignocericAcid100g", "ceroticAcid100g",
            "montanicAcid100g", "melissicAcid100g", "monounsaturatedFat100g",
            "polyunsaturatedFat100g", "omega3Fat100g", "alphaLinolenicAcid100g",
            "eicosapentaenoicAcid100g", "docosahexaenoicAcid100g", "omega6Fat100g",
            "linoleicAcid100g", "arachidonicAcid100g", "gammaLinolenicAcid100g",
            "dihomoGammaLinolenicAcid100g", "omega9Fat100g", "oleicAcid100g",
            "elaidicAcid100g", "gondoicAcid100g", "meadAcid100g", "erucicAcid100g",
            "nervonicAcid100g", "transFat100g", "cholesterol100g", "carbohydrates100g",
            "sugars100g", "sucrose100g", "glucose100g", "fructose100g", "lactose100g",
            "maltose100g", "maltodextrins100g", "starch100g", "polyols100g", "fiber100g",
            "proteins100g", "casein100g", "serumProteins100g", "nucleotides100g",
            "salt100g", "sodium100g", "alcohol100g", "vitaminA100g", "betaCarotene100g",
            "vitaminD100g", "vitaminE100g", "vitaminK100g", "vitaminC100g", "vitaminB1100g",
            "vitaminB2100g", "vitaminPp100g", "vitaminB6100g", "vitaminB9100g", "folates100g",
            "vitaminB12100g", "biotin100g", "pantothenicAcid100g", "silica100g",
            "bicarbonate100g", "potassium100g", "chloride100g", "calcium100g",
            "phosphorus100g", "iron100g", "magnesium100g", "zinc100g", "copper100g",
            "manganese100g", "fluoride100g", "selenium100g", "chromium100g",
            "molybdenum100g", "iodine100g", "caffeine100g", "taurine100g", "ph100g",
            "fruitsVegetablesNuts100g", "fruitsVegetablesNutsEstimate100g",
            "collagenMeatProteinRatio100g", "cocoa100g", "chlorophyl100g",
            "carbonFootprint100g", "nutritionScoreFr100g", "nutritionScoreUk100g",
            "glycemicIndex100g", "waterHardness100g"
            )
            .fieldSetMapper(new BeanWrapperFieldSetMapper<clean_foods>() {{
            setTargetType(clean_foods.class);
            }})
            .build();
    }
    @Bean
    public JpaItemWriter<clean_foods> writer(EntityManagerFactory entityManagerFactory) {
        return new JpaItemWriterBuilder<clean_foods>()
            .entityManagerFactory(entityManagerFactory)
            .build();
    }
    @Bean
    public Step csvImporterStep(ItemReader<clean_foods> reader, ItemWriter<clean_foods> writer, JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("csvImporterStep", jobRepository)
            .<clean_foods, clean_foods>chunk(10000, transactionManager)
            .reader(reader)
            .writer(writer)
            .allowStartIfComplete(true)
            .build();
    }

    @Bean
    public Job csvImporterJob(Step csvImporterStep, JobRepository jobRepository) {
        return new JobBuilder("csvImporterJob", jobRepository)
            .incrementer(new RunIdIncrementer())
            .flow(csvImporterStep)
            .end()
            .build();
    }
}
