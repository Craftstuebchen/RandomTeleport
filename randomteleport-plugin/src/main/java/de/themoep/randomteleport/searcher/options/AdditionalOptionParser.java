package de.themoep.randomteleport.searcher.options;

/*
 * RandomTeleport
 * Copyright (c) 2019 Max Lee aka Phoenix616 (mail@moep.tv)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

public class AdditionalOptionParser extends SimpleOptionParser {
    public AdditionalOptionParser(String... optionAliases) {
        super(optionAliases, ((searcher, args) -> {
            searcher.getOptions().put(optionAliases[0], args.length > 0 ? String.join(" ", args) : "true");
            return true;
        }));
    }
}
