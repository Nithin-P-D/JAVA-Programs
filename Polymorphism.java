
class Plane1{
	void takeoff() {
		System.out.println("Plane is taking off");
	}
	void fly() {
		System.out.println("Plane i flying");
	}
	void land() {
		System.out.println("Plane is landing");
	}
}
	
	class CargoPlane1 extends Plane{
		@Override
		void fly() {
			System.out.println("Cargo plane is flying");
		}
		void carryGoods() {
			System.out.println("cargo plane carry goods");
		}
	}
	class PassengerPlane1 extends Plane{
		@Override
		void fly() {
			System.out.println("passenger plane is flying");
		}
		void carryHumans() {
			System.out.println("passenger plane carry humans");
		}
	}	class FighterPlane1 extends Plane{
		@Override
		void fly() {
			System.out.println("fighter plane is flying");
		}
		void carryWeapons() {
			System.out.println("fighter plane carry weapons");
		}
	}
class Airport{
	void permit(Plane ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
	}
}
public class Polymorphism {
	public static void main(String[] args) {
		Airport a = new Airport();
		CargoPlane1 cp = new CargoPlane1();
		a.permit(cp);
		cp.carryGoods();
		System.out.println("========================");
		PassengerPlane1 pp = new PassengerPlane1();
		a.permit(pp);
		pp.carryHumans();
		System.out.println("========================");
		FighterPlane1 fp = new FighterPlane1();
		a.permit(fp);
		fp.carryWeapons();
		System.out.println("========================");
		
	}
}
