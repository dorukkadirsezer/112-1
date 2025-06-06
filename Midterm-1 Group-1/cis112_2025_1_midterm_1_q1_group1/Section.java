package cis112_2025_1_midterm_1_q1_group1;

/**
 * Section
 * 
 * @author bingol
 */
public class Section {

	public static final int I_COURSE_ID = 0;
	public static final int I_SECTION = 1;
	public static final int I_INSTRUCTOR = 2;
	public static final int I_TYPE = 3;
	public static final int I_DAY = 4;
	public static final int I_TIME = 5;
	public static final int I_CAPACITY = 6;
	public static final int I_BUILDING = 7;
	public static final int I_ROOM = 8;

	String courseID;
	String section;
	String instructor;
	String type;
	String day;
	String time;
	String capacity;
	String building;
	String room;

	public Section(String courseID, String section, String instructor, String type, String day, String time,
			String capacity, String building, String room) {
		this.courseID = courseID;
		this.section = section;
		this.instructor = instructor;
		this.type = type;
		this.day = day;
		this.time = time;
		this.capacity = capacity;
		this.building = building;
		this.room = room;
	}

	@Override
	public String toString() {
		return "[Section: courseID=" + courseID + ", instructor=" + instructor + ", section=" + section + ", day=" + day
				+ ", time=" + time + "]";
	}

	public String getCourseID() {
		return courseID;
	}

	public String getSection() {
		return section;
	}

	public String getInstructor() {
		return instructor;
	}

	public String getType() {
		return type;
	}

	public String getDay() {
		return day;
	}

	public String getTime() {
		return time;
	}

	public String getCapacity() {
		return capacity;
	}

	public String getBuilding() {
		return building;
	}

	public String getRoom() {
		return room;
	}

}
