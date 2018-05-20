package com.bagiswori.core.web.data;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.bagiswori.core.data.LongBase;

@XmlRootElement
@Entity
@Table(name = "EVENTS")
public class Events extends LongBase {

	private static final long serialVersionUID = 2627754887823074242L;

	@Column(name = "EVENT_SLUG")
	private String eventSlug;

	@Column(name = "START_TIME", nullable = false)
	private Time startTime;

	@Column(name = "DURATION")
	private String duration;

	@Column(name = "START_DATE", nullable = false)
	private Date startDate;

	@Column(name = "END_DATE")
	private Date endDate;

	@Column(name = "EVENT_CONTENT", nullable = false)
	private String eventContent;

	@Column(name = "EVENT_LINK")
	private String eventLink;

	@Column(name = "EVENT_IMAGE")
	private String eventImg;

	@Column(name = "LOCATION")
	private String location;

	@Column(name = "EVENT_TAGS")
	private String eventTags;

	public String getEventSlug() {
		return eventSlug;
	}

	public void setEventSlug(String eventSlug) {
		this.eventSlug = eventSlug;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getEventContent() {
		return eventContent;
	}

	public void setEventContent(String eventContent) {
		this.eventContent = eventContent;
	}

	public String getEventLink() {
		return eventLink;
	}

	public void setEventLink(String eventLink) {
		this.eventLink = eventLink;
	}

	public String getEventImg() {
		return eventImg;
	}

	public void setEventImg(String eventImg) {
		this.eventImg = eventImg;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEventTags() {
		return eventTags;
	}

	public void setEventTags(String eventTags) {
		this.eventTags = eventTags;
	}

	@Override
	public String toString() {
		return "Events [eventSlug=" + eventSlug + ", startTime=" + startTime + ", duration=" + duration + ", startDate="
				+ startDate + ", endDate=" + endDate + ", eventContent=" + eventContent + ", eventLink=" + eventLink
				+ ", eventImg=" + eventImg + ", location=" + location + ", eventTags=" + eventTags + "]";
	}

}
