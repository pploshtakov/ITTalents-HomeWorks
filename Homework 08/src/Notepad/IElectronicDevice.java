package Notepad;

public interface IElectronicDevice {
	/*
	 * Да се създаде интерфейс IЕlectronicDevice с методи: start() - стартира
	 * устройството stop() - спира устройството isStarted – проверява дали
	 * устройството е пуснато
	 */
	public void start();
	public void stop();
	public boolean isStarted();
}