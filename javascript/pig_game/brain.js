(() => {

    const oScope = {};
    const SCORE_TO_WIN = 100;

    const init = () => {
        console.log("--- Init ---");
        populatingScope();
        addingEventHandler();
        startGame();
    };

    const populatingScope = () => {
        // --- All buttons
        oScope.newGameBtn = document.querySelector(".new-btn");
        oScope.rollDiceBtn = document.querySelector(".roll-dice-btn");
        oScope.holdBtn = document.querySelector(".hold-btn");

        // --- dice
        oScope.dice = document.querySelector(".dice");

        // --- UI texts
        oScope.player1TotalScoreText = document.querySelector(".player-1 .player-info span");
        oScope.player2TotalScoreText = document.querySelector(".player-2 .player-info span");
        oScope.player1RoundScoreText = document.querySelector(".player-1 .round-info span");
        oScope.player2RoundScoreText = document.querySelector(".player-2 .round-info span");

        resetValue();
    }

    const addingEventHandler = () => {
        oScope.newGameBtn.addEventListener("click", startGame);
        oScope.rollDiceBtn.addEventListener("click", rollTheDice);
        oScope.holdBtn.addEventListener("click", holdHandler);
    }

    const startGame =() => {
        // --- resetting all values to defaults
        console.log(oScope);

        resetValue();
        setPlayerValues();
        setActivePlayer();
    };

    const resetValue = () => {
        // --- default values
        oScope.activePlayer = Math.floor(Math.random() * 2) + 1;
        oScope.player1TotalScore = 0;
        oScope.player2TotalScore = 0;
        oScope.player1RoundScore = 0;
        oScope.player2RoundScore = 0;
        oScope.isPlaying = true; // --- TODO: revert it to false
    };

    const setPlayerValues = () => {
        const {
            player1TotalScoreText, player1TotalScore,
            player2TotalScoreText, player2TotalScore,

            player1RoundScoreText, player1RoundScore,
            player2RoundScoreText, player2RoundScore,
        } = oScope;

        // --- TODO: only update active users text

        player1TotalScoreText.textContent = player1TotalScore;
        player2TotalScoreText.textContent = player2TotalScore;

        player1RoundScoreText.textContent = player1RoundScore;
        player2RoundScoreText.textContent = player2RoundScore;
    };

    const setActivePlayer = () => {
        const { activePlayer } = oScope;

        document.querySelector(".player-info .active").classList.remove("active");
        document.querySelectorAll(".player-info")[ activePlayer - 1 ].querySelector("h2").classList.add("active");

    };

    const rollTheDice = () => {
        const { isPlaying, dice, activePlayer } = oScope;

        if (isPlaying) {
            const randomDice = Math.floor(Math.random() * 6) + 1;
            dice.src = `./images/dice-${randomDice}.png`;


            if (randomDice === 1) {
                // --- change the turn
                changeRound();
            } else {
                if (activePlayer === 1) {
                    oScope.player1RoundScore += randomDice;
                } else {
                    oScope.player2RoundScore += randomDice;
                }
                setPlayerValues();
            }
        }
    };

    const changeRound = () => {
        oScope.player1RoundScore = 0;
        oScope.player2RoundScore = 0;

        if (oScope.player1TotalScore >= 100 || oScope.player2TotalScore >= 100) {
            alert(`Player ${(oScope.player1TotalScore >= 100) ? 1 : 2} have won!!!!`);
            startGame();
        } else {
            oScope.activePlayer = (oScope.activePlayer === 1) ? 2 : 1;

            setPlayerValues();
            setActivePlayer();
        }
    };

    const holdHandler = () => {
        const { activePlayer } = oScope;

        if (activePlayer === 1) {
            oScope.player1TotalScore += oScope.player1RoundScore;
        } else {
            oScope.player2TotalScore += oScope.player2RoundScore;
        }

        changeRound();
    }

    if (document.readyState === "loading" ) {
        document.addEventListener("DOMContentLoaded", init);
    } else {
        // --- DOMContentLoaded is fired so manually calling this same.
        init();
    }


})();