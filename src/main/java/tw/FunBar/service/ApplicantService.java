package tw.FunBar.service;

import java.util.List;
import java.util.Set;

import tw.FunBar.model.Activity;
import tw.FunBar.model.Applicant;
import tw.FunBar.model.Member;
import tw.FunBar.model.Suggestion;

public interface ApplicantService {
	
	public void addApplicant(String applicantName,String gender, String applicantPhone,
			String applicantEmail, int activityId, String memberId);
	
	public Set<Applicant> QuerySignupApplicant(int activityId);
	
	public List<Activity> QuerySignActivity(String memberId);
	
	public Applicant deleteApplicantById(int applicantId);
	
	public void deleteMap(String memberId, int activityId);
	
	public List<Applicant> getApplicants();
	
	
	//----------------------------------------------------------
	public void addSuggestion(Suggestion suggestion);
	
	public List<Suggestion> getAllSuggestion();
	
	public List<Suggestion> getSuggestionEventName();
	
	public List<Suggestion> getSuggestionByEventName(String eventName);
}

