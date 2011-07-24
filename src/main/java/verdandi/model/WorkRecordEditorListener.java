/*******************************************************************************
 * Copyright 2010 Olaf Sebelin
 * 
 * This file is part of Verdandi.
 * 
 * Verdandi is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Verdandi is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Verdandi.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
/*
 * Created on 29.10.2006
 * Author: osebelin
 *
 */
package verdandi.model;

import java.util.Date;

public interface WorkRecordEditorListener {

  public void dayChanged(Date day);

  public void dataChanged();

  /**
   * Fired, if a work record cannot be displayed, since it is out of boundaries.
   * 
   * @param d the date (time) that caoont be displayed
   */
  public void itemOutOfBoundaries(Date d);

}
