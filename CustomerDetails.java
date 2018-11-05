package Customer;

import java.util.Comparator;

public class CustomerDetails {
	
	private int Id; 
	private String name; 
	public String email;
	private String dob;
	public String city;
	
	public CustomerDetails() {
		
	}
	
	public CustomerDetails(int id, String name, String email, String dob, String city) {
		super();
		Id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.city = city;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "CustomerDetails [Id=" + Id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", city=" + city
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerDetails other = (CustomerDetails) obj;
		if (Id != other.Id)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	class StringLengthComparator implements Comparator<String> {

	    @Override
	    public int compare(String s1, String s2) {

	        int len1 = s1.length();
	        int len2 = s2.length();
	        
	        if(len1 > len2) {
	            return 1;
	        }
	        else if(len1 < len2) {
	            return -1;
	        }
	        
	        return 0;
	    }
	}

	class ReverseAlphabeticalComparator implements Comparator<String> {

	    @Override
	    public int compare(String s1, String s2) {
	        return -s1.compareTo(s2);
	    }
	    
	}	
	



}
