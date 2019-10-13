package tactics;

import player.Player;

/**
 * パーだけしか出さない戦略クラス。
 *
 * @author cilmesource
 */
public class PaperOnlyTactics implements Tactics {

  /* パーだけ出す。
   * @see tactics.Tactics#readTactics()
   */
  public int readTactics() {
    return Player.PAPER;
  }
}
