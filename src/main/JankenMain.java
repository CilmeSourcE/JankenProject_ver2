package main;

import judge.Judge;
import player.Player;
import tactics.RandomTactics;
import tactics.StoneOnlyTactics;
import tactics.Tactics;

/**
 * ジャンケンを実行するメインクラス。
 *
 * @author soneoy111
 */
public class JankenMain {

  /**
   * ジャンケンを実行するメインメソッド。
   *
   * @param args
   */
  public static void main(String[] args) {

    // プレイヤー1の生成
    Player player1 = new Player("村田さん");

    // プレイヤー1に渡す戦略クラスを生成する
    Tactics player1Tactics = new StoneOnlyTactics();

    // プレイヤー1に戦略を渡す
    player1.setTactics(player1Tactics);

    // プレイヤー2の生成
    Player player2 = new Player("佐藤さん");

    // プレイヤー2に渡す戦略クラスを生成する
    Tactics player2Tactics = new RandomTactics();

    // プレイヤー2に戦略を渡す
    player2.setTactics(player2Tactics);

    // 審判の生成
    Judge judgeman = new Judge();

    // ジャンケンの実行
    judgeman.startJanken(player1, player2);
  }
}
