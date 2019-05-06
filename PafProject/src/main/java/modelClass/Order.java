package modelClass;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Order")
public class Order {
	
	 @Id
	 @Column(name = "orderid")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private long orderId;
	 
	 @Column (name = "productid")
	 private long productId;
	 
	 @Column (name = "productname")
	 private String productName;
	 
	 @Column (name = "customerid")
	 private long customerId;
	 
	 @Column (name = "quantity")
	 private int quantity;
	 
	 @Column (name = "totalcost")
	 private float totalCost;
	 
	 @Column (name = "unitcost")
	 private float unitcost;
	 
	 @Column (name = "orderdate")
	 private Date orderdate;
	 
	 @Column (name = "status")
	 private String status;

}
