package tactics;

import player.Player;

/**
 * グーだけしか出さない戦略クラス。
 *
 * @author cilmesource
 */
public class StoneOnlyTactics implements Tactics {

  /* グーだけ出す。
   * @see tactics.Tactics#readTactics()
   */
  @Override
  public int readTactics() {
    return Player.STONE;
  }
}
