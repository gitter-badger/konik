/* Copyright (C) 2014 konik.io
 *
 * This file is part of the Konik library.
 *
 * The Konik library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * The Konik library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with the Konik library. If not, see <http://www.gnu.org/licenses/>.
 */
package io.konik.zugferd.entity;

import io.konik.validator.annotation.Comfort;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * = The Specified Allowance Charge.
 */
@XmlType(propOrder = { "category" })
public class SpecifiedAllowanceCharge extends AllowanceCharge {

   @XmlElement(name = "CategoryTradeTax")
   protected AppliedTax category;

   /**
    * Gets the category.
    *
    * @return the category
    */
   @Comfort
   public AppliedTax getCategory() {
      return category;
   }

   /**
    * Sets the category.
    *
    * @param category the new category
    * @return the allowance charge
    */
   public SpecifiedAllowanceCharge setCategory(AppliedTax category) {
      this.category = category;
      return this;
   }
}
