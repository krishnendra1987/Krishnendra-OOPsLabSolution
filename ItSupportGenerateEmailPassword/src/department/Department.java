package department;

/**
 * Below enum class is used for defining different deparatments and there values. 
 * @author krishnendra
 *
 */
public enum Department {
	TECHNICAL("tech"), ADMIN("admin"), HUMAN_RESOURCE("humanresource"), lEGAL("legal");

	private String departmentName;

	Department(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartMentName() {
		return departmentName;
	}
}