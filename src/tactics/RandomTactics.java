package tactics;

import player.Player;

/**
 * ランダムに手を決める戦略クラス。
 *
 * @author cilmesource
 */
public class RandomTactics implements Tactics {

  /* ランダムにジャンケンの手を決める。
   * @see extension.Tactics#readTactics()
   */
  @Override
  public int readTactics() {
    int showHandNum = 0;

    // 0以上3未満の少数として、乱数を取得する
    double randomNum = Math.random() * 3;

    if (randomNum < 1) {
      // 0.0~0.9はグー
      showHandNum = Player.STONE;
    } else if (randomNum < 2) {
      // 1.0~1.9はチョキ
      showHandNum = Player.SCISSORS;
    } else if (randomNum < 3) {
      // 2.0~2.9はパー
      showHandNum = Player.PAPER;
    }

    return showHandNum;
  }
}
