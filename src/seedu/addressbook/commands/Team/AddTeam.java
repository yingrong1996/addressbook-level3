package seedu.addressbook.commands.Team;

import seedu.addressbook.commands.Command;
import seedu.addressbook.commands.CommandResult;
import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.tag.Tag;
import seedu.addressbook.data.team.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Adds a Team to the address book.
 */

public class AddTeam extends Command {

    public static final String COMMAND_WORD = "addTeam";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ":\n" + "Adds a Team to the address book. "
            + "Parameters: NAME c/COUNTRY s/SPONSORSHIP BALANCE [t/TAG]...\n\t"
            + "Example: " + COMMAND_WORD
            + " Singapore United c/Singapore s/5487 t/Lousy";

    public static final String MESSAGE_SUCCESS = "New Team added: %1$s";
    public static final String MESSAGE_DUPLICATE_PERSON = "This Team already exists in the address book";

    private final Team toAdd;

    /**
     * Convenience constructor using raw values.
     *
     * @throws IllegalValueException if any of the raw values are invalid
     */
    public AddTeam(String name,
                   String country,
                   String sponsor,
                   Set<String> tags ) throws IllegalValueException {
        final Set<Tag> tagSet = new HashSet<>();
        for (String tagName : tags) {
            tagSet.add(new Tag(tagName));
        }
        this.toAdd = new Team(
                new Name(name),
                new Country(country),
                new Sponsor(sponsor),
                new HashSet<>(),
                tagSet
        );
    }

    public AddTeam(Team toAdd) { this.toAdd = toAdd; }

    public ReadOnlyTeam getTeam() {
        return toAdd;
    }

    @Override
    public CommandResult execute() {
        try {
            addressBook.addTeam(toAdd);
            return new CommandResult(String.format(MESSAGE_SUCCESS, toAdd));
        } catch (UniqueTeamList.DuplicateTeamException dpe) {
            return new CommandResult(MESSAGE_DUPLICATE_PERSON);
        }
    }
}
