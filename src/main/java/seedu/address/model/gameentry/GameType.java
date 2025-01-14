package seedu.address.model.gameentry;

import static java.util.Objects.requireNonNull;

public class GameType {
    private final String gameType;

    public GameType(String gameType) throws IllegalArgumentException {
        requireNonNull(gameType);
        String[] tmp = gameType.strip().split(" ");
        if (tmp.length == 0) {
            throw new IllegalArgumentException("Input cannot only contain whitespaces");
        }

        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = tmp[i].substring(0,1).toUpperCase() + tmp[i].substring(1).toLowerCase();
        }
        this.gameType = String.join(" ", tmp);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other instanceof GameType) {
            GameType tmp = (GameType) other;
            return gameType.equals(tmp.gameType);
        }
        return false;
    }

    @Override
    public String toString() {
        return gameType;
    }

    @Override
    public int hashCode() {
        return gameType.hashCode();
    }
}
