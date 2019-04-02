package seedu.addressbook.data.team;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

import seedu.addressbook.data.match.Match;
import seedu.addressbook.data.player.Player;
import seedu.addressbook.data.tag.Tag;


/**
 * Represents a team in the address book.
 * Guarantees: details are present and not null, field values are validated.
 */

public class Team implements ReadOnlyTeam {

    private Name name;
    private Country country;
    private Sponsor sponsor;
    private int win = 0;
    private int lose = 0;
    private int draw = 0;
    private int points = 0;
    private final Set<Player> playerlist = new HashSet<>();
    private final Set<Match> matchlist =new HashSet<>();
    private final Set<Tag> tags = new HashSet<>();
    /**
     * Assumption: Every field must be present and not null.
     */
    public Team(Name name, Country country, Sponsor sponsor, Set<Player> playerlist, Set<Tag> tags) {
        this.name = name;
        this.country = country;
        this.sponsor = sponsor;
        this.playerlist.addAll(playerlist);
        this.tags.addAll(tags);
    }

    /**
     * Copy constructor.
     */
    public Team(ReadOnlyTeam source) {
        this(source.getName(), source.getCountry(), source.getSponsor(), source.getPlayers(), source.getTags());
    }

    @Override
    public Set<Player> getPlayers() {
        return new HashSet<>(playerlist);
    }

    @Override
    public Set<Match> getMatches() {
        return new HashSet<>(matchlist);
    }

    @Override
    public Sponsor getSponsor() {
        return sponsor;
    }

    @Override
    public Name getName() {
        return name;
    }

    @Override
    public Country getCountry() {
        return country;
    }

    @Override
    public Set<Tag> getTags() {
        return new HashSet<>(tags);
    }

    @Override
    public int getPoints() {return points; }

    @Override
    public int getWins() {return win; }

    @Override
    public int getLoses() {return lose; }

    @Override
    public int getDraws() {return draw; }

    /**
     * Replaces this team's tags with the tags in {@code replacement}.
     */
    public void setTags(Set<Tag> replacement) {
        tags.clear();
        tags.addAll(replacement);
    }

    public void setPlayers(Set<Player> replacement) {
        playerlist.clear();
        playerlist.addAll(replacement);
    }

    public void updatePoints(int win, int draw) {
        this.points = (win * 3) + draw;
    }

    public void updateRecords(Set<Match> matchlist) {
        Iterator i = matchlist.iterator();
        while (i.hasNext()) {
            Match temp = (Match)i.next();
        }
    }

    public void addplayer(Player player) {
        this.playerlist.add(player);
    }

    public void addmatch(Match match) {
        this.matchlist.add(match);
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof ReadOnlyTeam // instanceof handles nulls
                && this.isSameStateAs((ReadOnlyTeam) other));
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(name, country, sponsor, playerlist, tags);
    }

    @Override
    public String toString() {
        return getAsTextShowAll();
    }

}

