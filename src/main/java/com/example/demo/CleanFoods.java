package com.example.demo;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "clean_foods")
public class CleanFoods {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String productName;
    private Double energy_100g;
    private Double energy_from_fat_100g;
    private Double fat_100g;
    private Double saturated_fat_100g;
    private Double butyric_acid_100g;
    private Double caproic_acid_100g;
    private Double caprylic_acid_100g;
    private Double capric_acid_100g;
    private Double lauric_acid_100g;
    private Double myristic_acid_100g;
    private Double palmitic_acid_100g;
    private Double stearic_acid_100g;
    private Double arachidic_acid_100g;
    private Double behenic_acid_100g;
    private Double lignoceric_acid_100g;
    private Double cerotic_acid_100g;
    private Double montanic_acid_100g;
    private Double melissic_acid_100g;
    private Double monounsaturated_fat_100g;
    private Double polyunsaturated_fat_100g;
    private Double omega_3_fat_100g;
    private Double alpha_linolenic_acid_100g;
    private Double eicosapentaenoic_acid_100g;
    private Double docosahexaenoic_acid_100g;
    private Double omega_6_fat_100g;
    private Double linoleic_acid_100g;
    private Double arachidonic_acid_100g;
    private Double gamma_linolenic_acid_100g;
    private Double dihomo_gamma_linolenic_acid_100g;
    private Double omega_9_fat_100g;
    private Double oleic_acid_100g;
    private Double elaidic_acid_100g;
    private Double gondoic_acid_100g;
    private Double mead_acid_100g;
    private Double erucic_acid_100g;
    private Double nervonic_acid_100g;
    private Double trans_fat_100g;
    private Double cholesterol_100g;
    private Double carbohydrates_100g;
    private Double sugars_100g;
    private Double sucrose_100g;
    private Double glucose_100g;
    private Double fructose_100g;
    private Double lactose_100g;
    private Double maltose_100g;
    private Double maltodextrins_100g;
    private Double starch_100g;
    private Double polyols_100g;
    private Double fiber_100g;
    private Double proteins_100g;
    private Double casein_100g;
    private Double serum_proteins_100g;
    private Double nucleotides_100g;
    private Double salt_100g;
    private Double sodium_100g;
    private Double alcohol_100g;
    private Double vitamin_a_100g;
    private Double beta_carotene_100g;
    private Double vitamin_d_100g;
    private Double vitamin_e_100g;
    private Double vitamin_k_100g;
    private Double vitamin_c_100g;
    private Double vitamin_b1_100g;
    private Double vitamin_b2_100g;
    private Double vitamin_pp_100g;
    private Double vitamin_b6_100g;
    private Double vitamin_b9_100g;
    private Double folates_100g;
    private Double vitamin_b12_100g;
    private Double biotin_100g;
    private Double pantothenic_acid_100g;
    private Double silica_100g;
    private Double bicarbonate_100g;
    private Double potassium_100g;
    private Double chloride_100g;
    private Double calcium_100g;
    private Double phosphorus_100g;
    private Double iron_100g;
    private Double magnesium_100g;
    private Double zinc_100g;
    private Double copper_100g;
    private Double manganese_100g;
    private Double fluoride_100g;
    private Double selenium_100g;
    private Double chromium_100g;
    private Double molybdenum_100g;
    private Double iodine_100g;
    private Double caffeine_100g;
    private Double taurine_100g;
    private Double ph_100g;
    private Double fruits_vegetables_nuts_100g;
    private Double fruits_vegetables_nuts_estimate_100g;
    private Double collagen_meat_protein_ratio_100g;
    private Double cocoa_100g;
    private Double chlorophyl_100g;
    private Double carbon_footprint_100g;
    private Double nutrition_score_fr_100g;
    private Double nutrition_score_uk_100g;
    private Double glycemic_index_100g;
    private Double water_hardness_100g;
}
