/**
 */
package Bowling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Bowling.Game#getMatchup <em>Matchup</em>}</li>
 *   <li>{@link Bowling.Game#getPlayer <em>Player</em>}</li>
 *   <li>{@link Bowling.Game#getFrames <em>Frames</em>}</li>
 * </ul>
 *
 * @see Bowling.BowlingPackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Matchup</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Bowling.Matchup#getGames <em>Games</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchup</em>' container reference.
	 * @see #setMatchup(Matchup)
	 * @see Bowling.BowlingPackage#getGame_Matchup()
	 * @see Bowling.Matchup#getGames
	 * @model opposite="games" transient="false"
	 * @generated
	 */
	Matchup getMatchup();

	/**
	 * Sets the value of the '{@link Bowling.Game#getMatchup <em>Matchup</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matchup</em>' container reference.
	 * @see #getMatchup()
	 * @generated
	 */
	void setMatchup(Matchup value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference.
	 * @see #setPlayer(Player)
	 * @see Bowling.BowlingPackage#getGame_Player()
	 * @model
	 * @generated
	 */
	Player getPlayer();

	/**
	 * Sets the value of the '{@link Bowling.Game#getPlayer <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(Player value);

	/**
	 * Returns the value of the '<em><b>Frames</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frames</em>' attribute list.
	 * @see Bowling.BowlingPackage#getGame_Frames()
	 * @model upper="10"
	 * @generated
	 */
	EList<Integer> getFrames();

} // Game
