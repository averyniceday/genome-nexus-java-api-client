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
import org.genome_nexus.client.Hg19;

/**
 * Cosmic
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-17T14:43:15.123-05:00")
public class Cosmic {
  @SerializedName("_license")
  private String license = null;

  @SerializedName("alt")
  private String alt = null;

  @SerializedName("chrom")
  private String chrom = null;

  @SerializedName("cosmicId")
  private String cosmicId = null;

  @SerializedName("hg19")
  private Hg19 hg19 = null;

  @SerializedName("mutFreq")
  private Double mutFreq = null;

  @SerializedName("mutNt")
  private String mutNt = null;

  @SerializedName("ref")
  private String ref = null;

  @SerializedName("tumorSite")
  private String tumorSite = null;

  public Cosmic license(String license) {
    this.license = license;
    return this;
  }

   /**
   * Get license
   * @return license
  **/
  @ApiModelProperty(value = "")
  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public Cosmic alt(String alt) {
    this.alt = alt;
    return this;
  }

   /**
   * alt
   * @return alt
  **/
  @ApiModelProperty(value = "alt")
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  public Cosmic chrom(String chrom) {
    this.chrom = chrom;
    return this;
  }

   /**
   * chrom
   * @return chrom
  **/
  @ApiModelProperty(value = "chrom")
  public String getChrom() {
    return chrom;
  }

  public void setChrom(String chrom) {
    this.chrom = chrom;
  }

  public Cosmic cosmicId(String cosmicId) {
    this.cosmicId = cosmicId;
    return this;
  }

   /**
   * cosmic_id
   * @return cosmicId
  **/
  @ApiModelProperty(value = "cosmic_id")
  public String getCosmicId() {
    return cosmicId;
  }

  public void setCosmicId(String cosmicId) {
    this.cosmicId = cosmicId;
  }

  public Cosmic hg19(Hg19 hg19) {
    this.hg19 = hg19;
    return this;
  }

   /**
   * hg19
   * @return hg19
  **/
  @ApiModelProperty(value = "hg19")
  public Hg19 getHg19() {
    return hg19;
  }

  public void setHg19(Hg19 hg19) {
    this.hg19 = hg19;
  }

  public Cosmic mutFreq(Double mutFreq) {
    this.mutFreq = mutFreq;
    return this;
  }

   /**
   * mut_freq
   * @return mutFreq
  **/
  @ApiModelProperty(value = "mut_freq")
  public Double getMutFreq() {
    return mutFreq;
  }

  public void setMutFreq(Double mutFreq) {
    this.mutFreq = mutFreq;
  }

  public Cosmic mutNt(String mutNt) {
    this.mutNt = mutNt;
    return this;
  }

   /**
   * mut_nt
   * @return mutNt
  **/
  @ApiModelProperty(value = "mut_nt")
  public String getMutNt() {
    return mutNt;
  }

  public void setMutNt(String mutNt) {
    this.mutNt = mutNt;
  }

  public Cosmic ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * ref
   * @return ref
  **/
  @ApiModelProperty(value = "ref")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public Cosmic tumorSite(String tumorSite) {
    this.tumorSite = tumorSite;
    return this;
  }

   /**
   * tumor_site
   * @return tumorSite
  **/
  @ApiModelProperty(value = "tumor_site")
  public String getTumorSite() {
    return tumorSite;
  }

  public void setTumorSite(String tumorSite) {
    this.tumorSite = tumorSite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cosmic cosmic = (Cosmic) o;
    return Objects.equals(this.license, cosmic.license) &&
        Objects.equals(this.alt, cosmic.alt) &&
        Objects.equals(this.chrom, cosmic.chrom) &&
        Objects.equals(this.cosmicId, cosmic.cosmicId) &&
        Objects.equals(this.hg19, cosmic.hg19) &&
        Objects.equals(this.mutFreq, cosmic.mutFreq) &&
        Objects.equals(this.mutNt, cosmic.mutNt) &&
        Objects.equals(this.ref, cosmic.ref) &&
        Objects.equals(this.tumorSite, cosmic.tumorSite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(license, alt, chrom, cosmicId, hg19, mutFreq, mutNt, ref, tumorSite);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cosmic {\n");
    
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
    sb.append("    chrom: ").append(toIndentedString(chrom)).append("\n");
    sb.append("    cosmicId: ").append(toIndentedString(cosmicId)).append("\n");
    sb.append("    hg19: ").append(toIndentedString(hg19)).append("\n");
    sb.append("    mutFreq: ").append(toIndentedString(mutFreq)).append("\n");
    sb.append("    mutNt: ").append(toIndentedString(mutNt)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    tumorSite: ").append(toIndentedString(tumorSite)).append("\n");
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

