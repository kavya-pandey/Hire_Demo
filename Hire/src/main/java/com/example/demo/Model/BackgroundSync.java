package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;



	@Entity
	@Table(name="backgroundsync")
	public class BackgroundSync {
		@Id
		private int interviewid;
		private String interviewemail;
		private String applicantname;
		private String finalverdict;
		private int roundid;
		@JsonFormat(pattern="yyyy-MM-ddTHH:mm:ss[.nnnnnnn]", shape=Shape.STRING)
		@Column(name="timeslot")
		private String timeslot;
	
		
		public BackgroundSync() {
			super();
		}
		


		public BackgroundSync(int interviewid, String interviewemail, String applicantname, String finalverdict, int roundid,
				String timeslot) {
			super();
			this.interviewid = interviewid;
			this.interviewemail = interviewemail;
			this.applicantname = applicantname;
			this.finalverdict = finalverdict;
			this.roundid = roundid;
			this.timeslot = timeslot;
		
		}
		
		
		public int getInterviewid() {
			return interviewid;
		}
		
		public void setInterviewid(int interviewid) {
			this.interviewid = interviewid;
		}
		
		public String getInterviewemail() {
			return interviewemail;
		}
		
		public void setInterviewemail(String interviewemail) {
			this.interviewemail = interviewemail;
		}
		
		public String getApplicantname() {
			return applicantname;
		}
		
		public void setApplicantname(String applicantname) {
			this.applicantname = applicantname;
		}
		
		public String getFinalverdict() {
			return finalverdict;
		}
		
		public void setFinalverdict(String finalverdict) {
			this.finalverdict = finalverdict;
		}
		
		public int getRoundid() {
			return roundid;
		}
		
		public void setRoundid(int roundid) {
			this.roundid = roundid;
		}
		
		public String getTimeslot() {
			return timeslot;
		}

		public void setTimeslot(String timeslot) {
			this.timeslot = timeslot;
		}

			
		
		
}

