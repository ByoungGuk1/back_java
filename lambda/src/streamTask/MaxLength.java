package streamTask;

import java.util.Objects;

public class MaxLength {
	private int size;
	
	public MaxLength() {;}

	public MaxLength(int size) {
		super();
		this.size = size;
	}

	int getSize() {
		return size;
	}

	void setSize(int size) {
		this.size = size;
	}

	@Override
	public int hashCode() {
		return Objects.hash(size);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MaxLength other = (MaxLength) obj;
		return Objects.equals(size, other.size);
	}
	@Override
	public String toString() {
		return "MaxLength [size=" + size + "]";
	}
}
