package player;

import tactics.Tactics;

/**
 * ジャンケンをするプレイヤーのクラス
 *
 * @author cilmesource
 */
public class Player {

  /** ジャンケンの手を表す定数:グー */
  public static final int STONE = 0;

  /** ジャンケンの手を表す定数:チョキ */
  public static final int SCISSORS = 1;

  /** ジャンケンの手を表す定数:パー */
  public static final int PAPER = 2;

  //--------------------------
  //プレイヤークラスの属性
  //--------------------------
  /** プレイヤーの名前 */
  private String name;

  /** プレイヤーの勝った回数 */
  private int winCount = 0;

  /** 与えられた戦略 */
  private Tactics tactics;

  /**
   * プレイヤークラスのコンストラクタ
   *
   * @param name 名前
   */
  public Player(String name) {
    this.name = name;
  }

  //--------------------------
  // プレイヤークラスの操作
  //--------------------------
  /**
  * ジャンケンの手を出す。
  *
  * @return ジャンケンの手
  */
  public int showHand() {

    // 戦略を読み、ジャンケンの手を受け取る
    int hand = tactics.readTactics();

    return hand;
  }

  /**
   * 審判から勝敗を聞く。
   *
   * @param result true:勝ち, false:負け
   */
  public void notifyResult(boolean result) {
    if (result) {
      // trueの場合、勝った回数をインクリメントする
      winCount++;
    }
  }

  /**
   * 自分の勝った回数を答える。
   *
   * @return 勝った回数
   */
  public int getWinCount() {
    return winCount;
  }

  /**
   * 自分の名前を教える。
   *
   * @return 名前
   */
  public String getName() {
    return name;
  }

  /**
   * 戦略を受け取る。
   *
   * @param tactics
   */
  public void setTactics(Tactics tactics) {
    this.tactics = tactics;
  }
}
