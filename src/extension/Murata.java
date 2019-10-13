package extension;

import player.Player;

/**
 * Playerクラスを継承した村田さんクラス。
 * グーしか出しません。
 *
 * @author cilmesource
 */
public class Murata extends Player {

  /**
   * コンストラクタ
   *
   * @param name 名前
   */
  public Murata(String name) {

    // スーパークラスのコンストラクタを呼び出す
    super(name);
  }

  /* グーだけ出す。
   * @see player.Player#showHand()
   */
  @Override
  public int showHand() {

    // 必ずグーを出す
    return STONE;
  }
}
