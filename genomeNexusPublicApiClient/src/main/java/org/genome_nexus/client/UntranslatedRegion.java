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
 * UntranslatedRegion
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-17T14:43:12.113-05:00")
public class UntranslatedRegion {
  @SerializedName("type")
  private String type = null;

  @SerializedName("start")
  private Integer start = null;

  @SerializedName("end")
  private Integer end = null;

  @SerializedName("strand")
  private Integer strand = null;

  public UntranslatedRegion type(String type) {
    this.type = type;
    return this;
  }

   /**
   * UTR Type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "UTR Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public UntranslatedRegion start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * Start position of UTR
   * @return start
  **/
  @ApiModelProperty(required = true, value = "Start position of UTR")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public UntranslatedRegion end(Integer end) {
    this.end = end;
    return this;
  }

   /**
   * End position of UTR
   * @return end
  **/
  @ApiModelProperty(required = true, value = "End position of UTR")
  public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  public UntranslatedRegion strand(Integer strand) {
    this.strand = strand;
    return this;
  }

   /**
   * Strand UTR is on, -1 for - and 1 for +
   * @return strand
  **/
  @ApiModelProperty(required = true, value = "Strand UTR is on, -1 for - and 1 for +")
  public Integer getStrand() {
    return strand;
  }

  public void setStrand(Integer strand) {
    this.strand = strand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UntranslatedRegion untranslatedRegion = (UntranslatedRegion) o;
    return Objects.equals(this.type, untranslatedRegion.type) &&
        Objects.equals(this.start, untranslatedRegion.start) &&
        Objects.equals(this.end, untranslatedRegion.end) &&
        Objects.equals(this.strand, untranslatedRegion.strand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, start, end, strand);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UntranslatedRegion {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    strand: ").append(toIndentedString(strand)).append("\n");
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

