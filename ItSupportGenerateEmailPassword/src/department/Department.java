package department;

public enum Department {

	TECHNICAL("technical"), ADMIN("admin"), HUMAN_RESOURCE("humanresource"), lEGAL("legal");

	private String departmentName;

	Department(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartMentName() {
		return departmentName;
	}
}