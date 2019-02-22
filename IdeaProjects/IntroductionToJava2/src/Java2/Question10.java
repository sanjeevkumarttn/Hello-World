
// 10. Design classes having attributes and method(only skeleton) for a coffee shop.
// There are three different actors in our scenario and i have listed the different actions
// they do also below
//
//* Customer
//  - Pays the cash to the cashier and places his order, get a token number back
//  - Waits for the intimation that order for his token is ready
//  - Upon intimation/notification he collects the coffee and enjoys his drink
//  ( Assumption:  Customer waits till the coffee is done, he wont timeout and cancel the order.
// Customer always likes the drink served. Exceptions like he not liking his coffee,
// he getting wrong coffee are not considered to keep the design simple.)
//
//* Cashier
//  - Takes an order and payment from the customer
//  - Upon payment, creates an order and places it into the order queue
//  - Intimates the customer that he has to wait for his token and gives him his token
//  ( Assumption: Token returned to the customer is the order id. Order queue is unlimited.
// With a simple modification, we can design for a limited queue size)
//
//* Barista
// - Gets the next order from the queue
// - Prepares the coffee
// - Places the coffee in the completed order queue
// - Places a notification that order for token is ready

package Java2;

//interface PendingOrderQueue {
//    void addOrder(Order order);
//    void getNextOrder();
//}

class Order {
    int tokenId;
    String coffeeType;

    void setOrderDetails(int tokenId, String coffeeType) {
        this.tokenId = tokenId;
        this.coffeeType = coffeeType;
    }
}

class Customer {
    String customerName;

   int placeOrder(String coffeeType) {



        return 1;// return token value place of 1.
    }

     //After placing the order customer will receive a token

    void waitForCoffee() {
    }

    ;//This method is to notify the customer when the order is ready to be collected

    void collectCoffee() {
    }

}

class Cashier {
    String employeeName;
    int employeeId;

    void takeOrder(Order order, int amount) {
    }

    ;

    void placeOrderToQueue() {
    }


}

class Barista {
    int employeeID;

    void prepareCoffee(String coffeeType) {
    }

    ;

    void addOrderToCompletedQueue(Order order) {
    }

    ;

    void notifyOnCompletion() {
    }
}



