package osgi.enroute.trains.cloud.api;

/**
 * The public Track interface for a Track Controller
 */
public interface TrackForController extends TrackInfo {

	/**
	 * Send when a train has been identified at a locator segment
	 * 
	 * @param train
	 *            The RFID for the train
	 * @param segment
	 *            The name of the segment
	 */
	void locatedTrainAt(String train, String segment);

	/**
	 * Indicate that a switch has been set
	 * 
	 * @param segment
	 *            the name of the switch segment
	 * @param alternative
	 *            defines the normal or alternative track
	 */
	void switched(String segment, boolean alternative);
}
