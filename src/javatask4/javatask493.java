
public class  TV {

	int channel = 1;
	int volumeLeve1 =1;
	boolean on =false;
	public void TV() {
		
	}
	public void turnOn() {
		on = true;
	}
	public void turnOff() {
		on = false;
	}
	public void setChannel(int newChannel) {
		if (on && newChannel >=1 && newChannel <= 120)
			channel = newChannel;
	}
	public void setVolume(int newVolumeLeve1) {
		if (on && newVolumeLeve1 >= 1 && newVolumeLeve1 <= 120)
			volumeLeve1 = newVolumeLeve1;
	}
	public void channelUp() {
		if(on && channel <120)
			channel++;
	}
	public void channelDown() {
		if (on && channel >1)
			channel--;
	}
	public void volumeUp() {
		if (on && volumeLeve1 < 7)
			volumeLeve1++;
	}
	public void volumeDown() {
		if (on && volumeLeve1 > 1)
			volumeLeve1++;
	}

}

