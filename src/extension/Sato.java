package extension;

import player.Player;

/**
 * Playerクラスを継承した佐藤さんクラス。
 * パーしか出しません。
 *
 * @author cilmesource
 */
public class Sato extends Player {

  /**
   * コンストラクタ
   *
   * @param name 名前
   */
  public Sato(String name) {

    // スーパークラスのコンストラクタを呼び出す
    super(name);
  }

  /* パーだけ出す。
   * @see player.Player#showHand()
   */
  @Override
  public int showHand() {

    // 必ずパーを出す
    return PAPER;
  }
}
