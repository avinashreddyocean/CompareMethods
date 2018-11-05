package Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;





public class TestCustomerDetails implements Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<CustomerDetails> customer = new ArrayList<CustomerDetails>();
        
		customer.add(new CustomerDetails(1, "Tom","Tom@gmail.com","Feb/01/1991","New York"));
		customer.add(new CustomerDetails(2, "Bob","Bob@gmail.com","Mar/01/1991","Detroit"));
		customer.add(new CustomerDetails(3, "Dan","Dan@gmail.com","Jan/01/1991","Dallas"));
		customer.add(new CustomerDetails(4, "Avin","Avin@gmail.com","Aug/01/1991","San Franscico"));
		customer.add(new CustomerDetails(5, "Joe","Joe@gmail.com","Oct/01/1991","New Jersey"));
		
		// Sort in order of ID
        Collections.sort(customer, new Comparator<CustomerDetails>() {
            public int compare1(CustomerDetails p1, CustomerDetails p2) {

                if(p1.getId() > p2.getId()) {
                    return 1;
                }
                else if(p1.getId() < p2.getId()) {
                    return -1;
                }
                
                return 0;
            }

			@Override
			public int compare(CustomerDetails o1, CustomerDetails o2) {
				// TODO Auto-generated method stub
				return 0;
			}
        });
        
        for (CustomerDetails customerDetails : customer) {
			System.out.println(customerDetails);
		}
        
        System.out.println("n");
        // Sort in order of name
        Collections.sort(customer, new Comparator<CustomerDetails>() {
            public int compare1(CustomerDetails p1, CustomerDetails p2) {
                return p1.getName().compareTo(p2.getName());
            }

			@Override
			public int compare(CustomerDetails o1, CustomerDetails o2) {
				// TODO Auto-generated method stub
				return 0;
			}
        });
        
        for (CustomerDetails customerDetails : customer) {
			System.out.println(customerDetails);
		}

	}

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

}
