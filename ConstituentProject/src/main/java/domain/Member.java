package domain;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)


public class Member {
	
	@JsonProperty(PersonId)
	private String personId;
	
	@JsonProperty(AffiliationId)
	private String affilationId;
	
	@JsonProperty(memberName)
	private String memberName;
	
	@JsonProperty(memberFirstName)
	private String memberFirstName;
	
	@JsonProperty(lastName)
	private String lastName;
	
	@JsonProperty(memberSortName)
	private String memberSortName;
	
	@JsonProperty(party)
	private String party;
	
	@JsonProperty(partyOrganisationId)
	private String partyOrganisationId;
	
	@JsonProperty(constituencyName)
	private String constituencyName;
	
	@JsonProperty(constituencyId)
	private String constituencyId;
	
	
	
	
	
}
