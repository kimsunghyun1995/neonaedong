package com.ssafy.nnd.dto;
//import com.example.oauth2.domain.BoardType;

import javax.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "memberrating")
public class MemberRating {

	@Id
	@Column (name = "ratingno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long ratingNo; //  평가 번호

	@Column
	private Long idx;   //외래키 평가 대상자 ( Member)
	
	@Column
	private Long commitCnt; // 커밋개수
	
	@Column 
	private Long issueCnt;   // 지라 이슈 개수

	@Column
	private Long attendRate; // 출석률 
	
	@Column
	private Long satisfaction;
	
	@Column 
	private Long teamworkship;

	@Column(name = "createdate", insertable = false, updatable = false)
	private LocalDateTime createDate;   //평가날짜
	
	public MemberRating() {
		// TODO Auto-generated constructor stub
	}

	

	public MemberRating(Long ratingNo, Long idx, Long commitCnt, Long issueCnt, Long attendRate, Long satisfaction,
			Long teamworkship, LocalDateTime createDate) {
		super();
		this.ratingNo = ratingNo;
		this.idx = idx;
		this.commitCnt = commitCnt;
		this.issueCnt = issueCnt;
		this.attendRate = attendRate;
		this.satisfaction = satisfaction;
		this.teamworkship = teamworkship;
		this.createDate = createDate;
	}



	public Long getRatingNo() {
		return ratingNo;
	}

	public void setRatingNo(Long ratingNo) {
		this.ratingNo = ratingNo;
	}

	public Long getIdx() {
		return idx;
	}

	public void setIdx(Long idx) {
		this.idx = idx;
	}

	public Long getCommitCnt() {
		return commitCnt;
	}

	public void setCommitCnt(Long commitCnt) {
		this.commitCnt = commitCnt;
	}

	public Long getIssueCnt() {
		return issueCnt;
	}

	public void setIssueCnt(Long issueCnt) {
		this.issueCnt = issueCnt;
	}

	public Long getAttendRate() {
		return attendRate;
	}

	public void setAttendRate(Long attendRate) {
		this.attendRate = attendRate;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}



	public Long getSatisfaction() {
		return satisfaction;
	}



	public void setSatisfaction(Long satisfaction) {
		this.satisfaction = satisfaction;
	}



	public Long getTeamworkship() {
		return teamworkship;
	}



	public void setTeamworkship(Long teamworkship) {
		this.teamworkship = teamworkship;
	}



	@Override
	public String toString() {
		return "MemberRating [ratingNo=" + ratingNo + ", idx=" + idx + ", commitCnt=" + commitCnt + ", issueCnt="
				+ issueCnt + ", attendRate=" + attendRate + ", satisfaction=" + satisfaction + ", teamworkship="
				+ teamworkship + ", createDate=" + createDate + "]";
	}

	
	
}
