package ro.ase.csie.cts.dp.observer;

public class UINotificationsModule implements NetworkEventHandlerInterface {

	@Override
	public void notifyNetworkDown() {
		System.out.println("Notify player: Connection lost");
	}

	@Override
	public void notifyNetworkUp() {
	  System.out.println("Notify player: Connection UP");
	}

}
