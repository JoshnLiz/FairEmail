package biweekly.io.scribe.property;

import java.util.Collections;
import java.util.List;

import biweekly.ICalDataType;
import biweekly.component.VAlarm;
import biweekly.property.Action;
import biweekly.property.DisplayAlarm;

import com.github.mangstadt.vinnie.io.VObjectPropertyValues.SemiStructuredValueIterator;

/*
 Copyright (c) 2013-2023, Michael Angstadt
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are met: 

 1. Redistributions of source code must retain the above copyright notice, this
 list of conditions and the following disclaimer. 
 2. Redistributions in binary form must reproduce the above copyright notice,
 this list of conditions and the following disclaimer in the documentation
 and/or other materials provided with the distribution. 

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/**
 * Marshals {@link DisplayAlarm} properties.
 * @author Michael Angstadt
 */
public class DisplayAlarmScribe extends VCalAlarmPropertyScribe<DisplayAlarm> {
	public DisplayAlarmScribe() {
		super(DisplayAlarm.class, "DALARM", ICalDataType.TEXT);
	}

	@Override
	protected List<String> writeData(DisplayAlarm property) {
		String text = property.getText();
		return (text == null) ? Collections.<String>emptyList() : Collections.singletonList(text);
	}

	@Override
	protected DisplayAlarm create(ICalDataType dataType, SemiStructuredValueIterator it) {
		return new DisplayAlarm(it.next());
	}

	@Override
	protected void toVAlarm(VAlarm valarm, DisplayAlarm property) {
		valarm.setDescription(property.getText());
	}

	@Override
	protected Action action() {
		return Action.display();
	}
}
