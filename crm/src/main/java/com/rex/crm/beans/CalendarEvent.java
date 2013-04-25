package com.rex.crm.beans;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CalendarEvent {
	private int id;
	private String title;
	private boolean allDay = false;
	private String start;
    private String end;
    private long starttime;
    private long endtime;
	private int crmUserId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isAllDay() {
		return allDay;
	}

	public void setAllDay(boolean allDay) {
		this.allDay = allDay;
	}

	@Override
	public String toString() {
		Gson gson = new GsonBuilder().create();
		return gson.toJson(this, CalendarEvent.class).toString();
		
	}

	public int getCrmUserId() {
		return crmUserId;
	}

	public void setCrmUserId(int crmUserId) {
		this.crmUserId = crmUserId;
	}
	
	    public String getStart() {
	        return start;
	    }

	    public void setStart(String start) {
	        this.start = start;
	    }

	    public String getEnd() {
	        return end;
	    }

	    public void setEnd(String end) {
	        this.end = end;
	    }

        public long getStarttime() {
            return starttime;
        }

        public void setStarttime(long starttime) {
            this.starttime = starttime;
        }

        public long getEndtime() {
            return endtime;
        }

        public void setEndtime(long endtime) {
            this.endtime = endtime;
        }

}