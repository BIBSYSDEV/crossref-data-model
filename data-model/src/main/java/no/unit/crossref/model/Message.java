package no.unit.crossref.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Message {

    @JsonProperty("indexed")
    private CrossrefDate indexed;
    @JsonProperty("reference-count")
    private int referenceCount;
    @JsonProperty("publisher")
    private String publisher;
    @JsonProperty("issue")
    private String issue;
    @JsonProperty("license")
    private List<License> license;
    @JsonProperty("content-domain")
    private ContentDomain contentDomain;
    @JsonProperty("short-container-title")
    private List<String> shortContainerTitle;
    @JsonProperty("published-print")
    private CrossrefDate publishedPrint;
    @JsonProperty("DOI")
    private String doi;
    @JsonProperty("type")
    private String type;
    @JsonProperty("created")
    private CrossrefDate created;
    @JsonProperty("page")
    private String page;
    @JsonProperty("source")
    private String source;
    @JsonProperty("is-referenced-by-count")
    private int isReferencedByCount;
    @JsonProperty("title")
    private String[] title;
    @JsonProperty("prefix")
    private String prefix;
    @JsonProperty("volume")
    private String volume;
    @JsonProperty("author")
    private List<Author> author;
    @JsonProperty("member")
    private String member;
    @JsonProperty("reference")
    private List<Reference> reference;
    @JsonProperty("container-title")
    private List<String> containerTitle;
    @JsonProperty("original-title")
    private List<String> originalTitle;
    @JsonProperty("language")
    private String language;
    @JsonProperty("link")
    private List<Link> link;
    @JsonProperty("deposited")
    private CrossrefDate deposited;
    @JsonProperty("score")
    private float score;
    @JsonProperty("subtitle")
    private List<String> subtitle;
    @JsonProperty("short-title")
    private List<String> shortTitle;
    @JsonProperty("issued")
    private CrossrefDate issued;
    @JsonProperty("references-count")
    private int referencesCount;
    @JsonProperty("journal-issue")
    private JournalIssue journalIssue;
    @JsonProperty("alternative-id")
    private List<String> alternativeId;
    @JsonProperty("URL")
    private String url;
    @JsonProperty("relation")
    private Relation relation;
    @JsonProperty("ISSN")
    private List<String> issn;
    @JsonProperty("issn-type")
    private List<Issn> issnType;

    public void setIndexed(CrossrefDate indexed) {
        this.indexed = indexed;
    }

    public ContentDomain getContentDomain() {
        return contentDomain;
    }

    public void setContentDomain(ContentDomain contentDomain) {
        this.contentDomain = contentDomain;
    }

    public List<String> getShortContainerTitle() {
        return shortContainerTitle;
    }

    public void setShortContainerTitle(List<String> shortContainerTitle) {
        this.shortContainerTitle = shortContainerTitle;
    }
    public int getReferenceCount() {
        return referenceCount;
    }

    public void setReferenceCount(int input) {
        this.referenceCount = input;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String input) {
        this.publisher = input;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String input) {
        this.issue = input;
    }

    public List<License> getLicense() {
        return license;
    }

    public void setLicense(List<License> input) {
        this.license = input;
    }

    public List<String> getContainerTitle() {
        return containerTitle;
    }

    public void setContainerTitle(List<String> input) {
        this.containerTitle = input;
    }

    public List<String> getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(List<String> input) {
        this.originalTitle = input;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String input) {
        this.language = input;
    }

    public List<Link> getLink() {
        return link;
    }

    public void setLink(List<Link> input) {
        this.link = input;
    }

    public CrossrefDate getDeposited() {
        return deposited;
    }

    public void setDeposited(CrossrefDate input) {
        this.deposited = input;
    }

    public float getScore() {
        return score;
    }

    public void setScore(int input) {
        this.score = input;
    }

    public List<String> getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(List<String> input) {
        this.subtitle = input;
    }

    public List<String> getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(List<String> input) {
        this.shortTitle = input;
    }

    public CrossrefDate getIssued() {
        return issued;
    }

    public void setIssued(CrossrefDate input) {
        this.issued = input;
    }

    public int getReferencesCount() {
        return referencesCount;
    }

    public void setReferencesCount(int input) {
        this.referencesCount = input;
    }

    public JournalIssue getJournalIssue() {
        return journalIssue;
    }

    public void setJournalIssue(JournalIssue input) {
        this.journalIssue = input;
    }

    public List<String> getAlternativeId() {
        return alternativeId;
    }

    public void setAlternativeId(List<String> input) {
        this.alternativeId = input;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String input) {
        this.url = input;
    }

    public Relation getRelation() {
        return relation;
    }

    public void setRelation(Relation input) {
        this.relation = input;
    }

    public List<String> getIssn() {
        return issn;
    }

    public void setIssn(List<String> input) {
        this.issn = input;
    }

    public List<Issn> getIssnType() {
        return issnType;
    }

    public void setIssnType(List<Issn> input) {
        this.issnType = input;
    }

    public CrossrefDate getPublishedPrint() {
        return publishedPrint;
    }

    public void setPublishedPrint(CrossrefDate publishedPrint) {
        this.publishedPrint = publishedPrint;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CrossrefDate getCreated() {
        return created;
    }

    public void setCreated(CrossrefDate created) {
        this.created = created;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getIsReferencedByCount() {
        return isReferencedByCount;
    }

    public void setIsReferencedByCount(int isReferencedByCount) {
        this.isReferencedByCount = isReferencedByCount;
    }

    public String[] getTitle() {
        return title;
    }

    public void setTitle(String[] title) {
        this.title = title;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}


