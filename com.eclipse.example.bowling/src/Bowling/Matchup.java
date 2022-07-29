/**
 */
package Bowling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matchup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Bowling.Matchup#getGames <em>Games</em>}</li>
 * </ul>
 *
 * @see Bowling.BowlingPackage#getMatchup()
 * @model
 * @generated
 */
public interface Matchup extends EObject {
	/**
	 * Returns the value of the '<em><b>Games</b></em>' containment reference list.
	 * The list contents are of type {@link Bowling.Game}.
	 * It is bidirectional and its opposite is '{@link Bowling.Game#getMatchup <em>Matchup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Games</em>' containment reference list.
	 * @see Bowling.BowlingPackage#getMatchup_Games()
	 * @see Bowling.Game#getMatchup
	 * @model opposite="matchup" containment="true" upper="2"
	 * @generated
	 */
	EList<Game> getGames();

} // Matchup
