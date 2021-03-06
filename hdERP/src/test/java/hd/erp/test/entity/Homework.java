package hd.erp.test.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity

@Table(name = "homework")
public class Homework {
	@Id@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "homework_seq")
	@SequenceGenerator(name ="homework_seq",allocationSize = 1,sequenceName = "homework_seq" )
	@Column(name = "h_num")
	private Long hnum;
	
	@Column(name = "h_name")
	private String hname;
	
	@Column(name = "h_date")
	@Temporal(TemporalType.DATE)
	private Date hdate;
	
	//@Column(name = "s_num")
	@JoinColumn(name = "student_s_num")
	@ManyToOne
	private Student snum;

	public Long getHnum() {
		return hnum;
	}

	public void setHnum(Long hnum) {
		this.hnum = hnum;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public Date getHdate() {
		return hdate;
	}

	public void setHdate(Date hdate) {
		this.hdate = hdate;
	}

	public Student getSnum() {
		return snum;
	}

	public void setSnum(Student snum) {
		this.snum = snum;
	}
	
	
}
