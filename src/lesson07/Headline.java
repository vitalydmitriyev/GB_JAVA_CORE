package lesson07;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "EffectiveDate",
        "EffectiveEpochDate",
        "Severity",
        "Text",
        "Category",
        "EndDate",
        "EndEpochDate",
        "MobileLink",
        "Link"
})

public class Headline {

    @JsonProperty("EffectiveDate")
    private String effectiveDate;
    @JsonProperty("EffectiveEpochDate")
    private Integer effectiveEpochDate;
    @JsonProperty("Severity")
    private Integer severity;
    @JsonProperty("Text")
    private String text;
    @JsonProperty("Category")
    private String category;
    @JsonProperty("EndDate")
    private Object endDate;
    @JsonProperty("EndEpochDate")
    private Object endEpochDate;
    @JsonProperty("MobileLink")
    private String mobileLink;
    @JsonProperty("Link")
    private String link;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("EffectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("EffectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("EffectiveEpochDate")
    public Integer getEffectiveEpochDate() {
        return effectiveEpochDate;
    }

    @JsonProperty("EffectiveEpochDate")
    public void setEffectiveEpochDate(Integer effectiveEpochDate) {
        this.effectiveEpochDate = effectiveEpochDate;
    }

    @JsonProperty("Severity")
    public Integer getSeverity() {
        return severity;
    }

    @JsonProperty("Severity")
    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    @JsonProperty("Text")
    public String getText() {
        return text;
    }

    @JsonProperty("Text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("Category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("Category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("EndDate")
    public Object getEndDate() {
        return endDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("EndEpochDate")
    public Object getEndEpochDate() {
        return endEpochDate;
    }

    @JsonProperty("EndEpochDate")
    public void setEndEpochDate(Object endEpochDate) {
        this.endEpochDate = endEpochDate;
    }

    @JsonProperty("MobileLink")
    public String getMobileLink() {
        return mobileLink;
    }

    @JsonProperty("MobileLink")
    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    @JsonProperty("Link")
    public String getLink() {
        return link;
    }

    @JsonProperty("Link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}