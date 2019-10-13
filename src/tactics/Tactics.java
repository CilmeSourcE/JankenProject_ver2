package tactics;

/**
 * ジャンケン戦略インターフェース
 *
 * @author cilmesource
 */
public interface Tactics {

  /**
   * 戦略を読み、ジャンケンの手を得る。
   * グー・チョキ・パーのいずれかを、Playerクラスに定義された
   * 以下の定数で返す。
   * Player.STONE …グー
   * Player.SCISSORS …チョキ
   * Player.PAPER …パー
   *
   * @return ジャンケンの手
   */
  public int readTactics();
}
