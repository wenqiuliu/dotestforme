package irorcom;

public class Jdbcconnection {
	private Double state;
	private String firehot;
	private String waterflower;
	public Double getState() {
		return state;
	}
	public void setState(Double state) {
		this.state = state;
	}
	public String getFirehot() {
		return firehot;
	}
	public void setFirehot(String firehot) {
		this.firehot = firehot;
	}
	public String getWaterflower() {
		return waterflower;
	}
	public void setWaterflower(String waterflower) {
		this.waterflower = waterflower;
	}
	@Override
	public String toString() {
		return "Jdbcconnection [state=" + state + ", firehot=" + firehot + ", waterflower=" + waterflower + "]";
	}
	

}
