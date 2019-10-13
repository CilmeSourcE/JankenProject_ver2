package main;

import extension.Murata;
import extension.Sato;
import judge.Judge;
import player.Player;

/**
 * Playerクラスを継承したクラスで、ジャンケンを実行するメインクラス。
 *
 * @author cilmesource
 */
public class JankenExtMain {

  /**
   * Playerクラスを継承したクラスで、ジャンケンを実行するメインメソッド。
   *
   * @param args
   */
  public static void main(String[] args) {

    // プレイヤーの設定
    Player Murata = new Murata("村田さん");
    Player Sato = new Sato("佐藤さん");

    Judge judgeMan = new Judge();

    // ジャンケンの実行
    judgeMan.startJanken(Murata, Sato);
  }

}
