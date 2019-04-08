package seedu.addressbook.commands;

import seedu.addressbook.commands.finance.GetFinanceCommand;
import seedu.addressbook.commands.finance.GetLeagueFinanceCommand;
import seedu.addressbook.commands.finance.ListFinanceCommand;
import seedu.addressbook.commands.finance.RankFinanceCommand;
import seedu.addressbook.commands.finance.ViewFinanceCommand;
import seedu.addressbook.commands.match.AddMatchCommand;
import seedu.addressbook.commands.match.ClearMatchCommand;
import seedu.addressbook.commands.match.DeleteMatchCommand;
import seedu.addressbook.commands.match.FindMatchCommand;
import seedu.addressbook.commands.match.ListMatchCommand;
import seedu.addressbook.commands.player.AddCommand;
import seedu.addressbook.commands.player.ClearCommand;
import seedu.addressbook.commands.player.DeleteCommand;
import seedu.addressbook.commands.player.FindCommand;
import seedu.addressbook.commands.player.ListCommand;
import seedu.addressbook.commands.player.SortCommand;
import seedu.addressbook.commands.player.ViewAllCommand;
import seedu.addressbook.commands.team.AddTeam;
import seedu.addressbook.commands.team.ClearTeam;
import seedu.addressbook.commands.team.DeleteTeam;
import seedu.addressbook.commands.team.EditTeam;
import seedu.addressbook.commands.team.FindTeam;
import seedu.addressbook.commands.team.ListTeam;
import seedu.addressbook.commands.team.ViewTeam;

/**
 * Shows help instructions.
 */
public class HelpCommand extends Command {

    public static final String COMMAND_WORD = "help";
    public static final String PLAYER_COMMAND = "\n\nPLAYER COMMANDS:\n";
    public static final String TEAM_COMMAND = "\n\nTEAM COMMANDS:\n";
    public static final String MATCH_COMMAND = "\n\nMATCH COMMANDS:\n";
    public static final String FINANCE_COMMAND = "\n\nFINANCE COMMANDS:\n";
    public static final String COMMON_COMMAND = "COMMON COMMANDS:\n";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ":\n" + "Shows program usage instructions.\n\t"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_ALL_USAGES = COMMON_COMMAND
            + HelpCommand.MESSAGE_USAGE
            + "\n" + ExitCommand.MESSAGE_USAGE
            + PLAYER_COMMAND
            + AddCommand.MESSAGE_USAGE
            + "\n" + DeleteCommand.MESSAGE_USAGE
            + "\n" + ClearCommand.MESSAGE_USAGE
            + "\n" + FindCommand.MESSAGE_USAGE
            + "\n" + ListCommand.MESSAGE_USAGE
            + "\n" + SortCommand.MESSAGE_USAGE
            + TEAM_COMMAND
            + "\n" + AddTeam.MESSAGE_USAGE
            + "\n" + EditTeam.MESSAGE_USAGE
            + "\n" + DeleteTeam.MESSAGE_USAGE
            + "\n" + ClearTeam.MESSAGE_USAGE
            + "\n" + FindTeam.MESSAGE_USAGE
            + "\n" + ListTeam.MESSAGE_USAGE
            + "\n" + ViewTeam.MESSAGE_USAGE
            + "\n" + ViewAllCommand.MESSAGE_USAGE
            + FINANCE_COMMAND
            + "\n" + GetFinanceCommand.MESSAGE_USAGE
            + "\n" + GetLeagueFinanceCommand.MESSAGE_USAGE
            + "\n" + ListFinanceCommand.MESSAGE_USAGE
            + "\n" + RankFinanceCommand.MESSAGE_USAGE
            + "\n" + ViewFinanceCommand.MESSAGE_USAGE
            + MATCH_COMMAND
            + "\n" + AddMatchCommand.MESSAGE_USAGE
            + "\n" + DeleteMatchCommand.MESSAGE_USAGE
            + "\n" + ClearMatchCommand.MESSAGE_USAGE
            + "\n" + FindMatchCommand.MESSAGE_USAGE
            + "\n" + ListMatchCommand.MESSAGE_USAGE;

    @Override
    public CommandResult execute() {
        return new CommandResult(MESSAGE_ALL_USAGES);
    }
}
