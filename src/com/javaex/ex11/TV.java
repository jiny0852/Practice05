package com.javaex.ex11;

public class TV {
	
	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	static int i = 1; //체크용
	
	
	//생성자
	public TV() {	}
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	//메서드 gs
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
	//메서드
	
	public void power( boolean power ) { //턴온오프
		if ( power == true ) {
			//System.out.println("티비 전원이 켜졌습니다");
			this.power = true;
		} else if ( power == false ) {
			//System.out.println("티비 전원이 꺼졌습니다");
			this.power = false;
		}
		
	}
	
	public void channel (int channel) { //입력받은 채널로 변경 1~255 유지
		
		if ( power != false ) {
			if ( channel > 0 && channel <=255 ) {
				this.channel = channel;
			} else { //없앨까
				System.out.println("채널이 존재하지 않습니다.");
				channel = channel;
			}
		} else {
			System.out.println("티비 전원이 꺼졌습니다");
		}
	}
	
	public void channel ( boolean up ) { //true 채널++ false채널--
		
		if ( power != false ) {
			if ( channel > 0 && channel < 255 ) {
				if( up == true) {
					channel++;
				} else if ( up == false) {
					channel--;
				}
			} else if (channel == 255 && up == true) { //없앨까
				channel = 1;
			} else if (channel == 1 && up == false) { //없앨까
				channel = 255;
			}	
		} else {
			System.out.println("티비 전원이 꺼졌습니다");
		}	
	}
	
	public void volume ( int volume ) { //볼륨 변경 0~100 유지
		
		if ( power != false ) {
			if ( volume >= 0 && volume <= 100 ) {
				this.volume = volume;
			} else if ( volume > 100 ){ 
				this.volume = 100;
			}
		} else {
			System.out.println("티비 전원이 꺼졌습니다");
		}
	}
	
	public void volume ( boolean up ) { //true 볼륨++ false볼륨--
		
		if ( power != false ) {
			if ( volume >= 0 && volume < 100 ) {
				if ( volume == 0 && up == false  ) {
					System.out.println("최소 볼륨입니다.");
					volume = 0;
				} else if ( up == true ) {
					volume++;
				} else if ( up == false ) {
					volume--;
				}
			} else if ( volume >= 100 ){ //없앨까
				System.out.println("최대 볼륨입니다.");
				volume = 100;
			}
		} else {
			System.out.println("티비 전원이 꺼졌습니다");
		}
	}
	
	public void status () { //티비 상태 표시
		
		//System.out.println(i); //체크용
		i++;
		
		System.out.println("-----------------");
		System.out.println("전원 : " + power + "\n채널 : " + channel + "\n볼륨 : " + volume);
		System.out.println("-----------------");
		
	}
	
	
	
	

}
