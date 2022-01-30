package org.phone;

public class PhoneInfo {
	
  private void phoneName() {
	// TODO Auto-generated method stub
  System.out.println("Phone Name is Realme");
}
  private void phoneMieiNum() {
	// TODO Auto-generated method stub
  System.out.println("Phone MieiNum is 2345678912");
}
  private void camera() {
	// TODO Auto-generated method stub
  System.out.println("Camera is 64MB Megapixel");

}
  private void storage() {
	// TODO Auto-generated method stub
 System.out.println("Storage is 8GB RAM and 64GB ROM");
}
  private void osName() {
	// TODO Auto-generated method stub
  System.out.println("Os Name is Colour OS");
}
  public static void main(String[] args) {
  
   PhoneInfo pi = new PhoneInfo();
   pi.phoneName();
   pi.phoneMieiNum();
   pi.camera();
   pi.storage();
   pi.osName();
}

}

