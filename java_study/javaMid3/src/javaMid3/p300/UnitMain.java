package javaMid3.p300;

import java.util.Scanner;

public class UnitMain {

	public static void main(String[] args) {
		// ����Ͻ� Ŭ����
        Scanner sc = new Scanner(System.in);
        Marine marine  = new Marine();
        System.out.print("������ ��ġ");
        int x = sc.nextInt();
        marine.setX(x);
        int y = sc.nextInt();
        marine.setY(y);
        marine.move(x, y);
        marine.stop();
        marine.stimPack();
        
        Tank tank = new Tank();
        System.out.println("��ũ�� ��ġ");
        x = sc.nextInt();
        y = sc.nextInt();
        tank.setX(x);
        tank.setY(y);
        tank.move(x, y);
        tank.stop();
        tank.changeMode();
        
        Dropship dropship = new Dropship();
        System.out.println("���ۼ��� ��ġ");
        x = sc.nextInt();
        y = sc.nextInt();
        dropship.setX(x);
        dropship.setY(y);
        dropship.stop();
        dropship.load(marine);
        dropship.unload(tank);
	}
}
