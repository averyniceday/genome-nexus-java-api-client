/*
 * Genome Nexus API
 * This page shows how to use HTTP requests to access the Genome Nexus API. There are more high level clients available in Python, R, JavaScript, TypeScript and various other languages as well as a command line client to annotate MAF and VCF. See https://docs.genomenexus.org/api.  Aside from programmatic clients there are web based tools to annotate variants, see https://docs.genomenexus.org/tools.   We currently only provide long-term support for the '/annotation' endpoint. The other endpoints might change.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.genome_nexus.client;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GenomicLocation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-17T14:43:12.113-05:00")
public class GenomicLocation {
  @SerializedName("chromosome")
  private String chromosome = null;

  @SerializedName("start")
  private Integer start = null;

  @SerializedName("end")
  private Integer end = null;

  @SerializedName("referenceAllele")
  private String referenceAllele = null;

  @SerializedName("variantAllele")
  private String variantAllele = null;

  public GenomicLocation chromosome(String chromosome) {
    this.chromosome = chromosome;
    return this;
  }

   /**
   * Chromosome
   * @return chromosome
  **/
  @ApiModelProperty(required = true, value = "Chromosome")
  public String getChromosome() {
    return chromosome;
  }

  public void setChromosome(String chromosome) {
    this.chromosome = chromosome;
  }

  public GenomicLocation start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * Start Position
   * @return start
  **/
  @ApiModelProperty(required = true, value = "Start Position")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public GenomicLocation end(Integer end) {
    this.end = end;
    return this;
  }

   /**
   * End Position
   * @return end
  **/
  @ApiModelProperty(required = true, value = "End Position")
  public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  public GenomicLocation referenceAllele(String referenceAllele) {
    this.referenceAllele = referenceAllele;
    return this;
  }

   /**
   * Reference Allele
   * @return referenceAllele
  **/
  @ApiModelProperty(required = true, value = "Reference Allele")
  public String getReferenceAllele() {
    return referenceAllele;
  }

  public void setReferenceAllele(String referenceAllele) {
    this.referenceAllele = referenceAllele;
  }

  public GenomicLocation variantAllele(String variantAllele) {
    this.variantAllele = variantAllele;
    return this;
  }

   /**
   * Variant Allele
   * @return variantAllele
  **/
  @ApiModelProperty(required = true, value = "Variant Allele")
  public String getVariantAllele() {
    return variantAllele;
  }

  public void setVariantAllele(String variantAllele) {
    this.variantAllele = variantAllele;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenomicLocation genomicLocation = (GenomicLocation) o;
    return Objects.equals(this.chromosome, genomicLocation.chromosome) &&
        Objects.equals(this.start, genomicLocation.start) &&
        Objects.equals(this.end, genomicLocation.end) &&
        Objects.equals(this.referenceAllele, genomicLocation.referenceAllele) &&
        Objects.equals(this.variantAllele, genomicLocation.variantAllele);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chromosome, start, end, referenceAllele, variantAllele);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenomicLocation {\n");
    
    sb.append("    chromosome: ").append(toIndentedString(chromosome)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    referenceAllele: ").append(toIndentedString(referenceAllele)).append("\n");
    sb.append("    variantAllele: ").append(toIndentedString(variantAllele)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

