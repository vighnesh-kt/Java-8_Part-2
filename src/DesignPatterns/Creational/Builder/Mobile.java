package DesignPatterns.Creational.Builder;


public class Mobile {

	final int ram, storage;	
	final int battery;			
	final int camera;			
	final String processor;
	final double screenSize;	
	

	
	private Mobile(MobileBuilder builder) {
		super();
		this.ram = builder.ram;
		this.storage = builder.storage;
		this.battery = builder.battery;
		this.camera = builder.camera;
		this.processor = builder.processor;
		this.screenSize = builder.screenSize;
	}

	public int getRam() {
		return ram;
	}

	public int getStorage() {
		return storage;
	}

	public int getBattery() {
		return battery;
	}

	public int getCamera() {
		return camera;
	}

	public String getProcessor() {
		return processor;
	}

	public double getScreenSize() {
		return screenSize;
	}
	
	public String toString() {
		return String.format("Specifications- RAM: %d Storage: %d Battery: %d Camera: %dMP Processor: %s Display: %f''", ram, storage, battery, camera, processor, screenSize);
	}
	
	public static class MobileBuilder {
		
		int ram, storage;
		int battery;			
		int camera;			
		String processor;
		double screenSize;
		
		public MobileBuilder setRam(int ram) {
			this.ram = ram;
			return this;
		}

		public MobileBuilder setStorage(int storage) {
			this.storage = storage;
			return this;
		}

		public MobileBuilder setBattery(int battery) {
			this.battery = battery;
			return this;
		}

		public MobileBuilder setCamera(int camera) {
			this.camera = camera;
			return this;
		}

		public MobileBuilder setProcessor(String processor) {
			this.processor = processor;
			return this;
		}

		public MobileBuilder setScreenSize(double screenSize) {
			this.screenSize = screenSize;
			return this;
		}	
		
		public Mobile build() {
			Mobile mobile=new Mobile(this);
			return mobile;
		}

	}

}
