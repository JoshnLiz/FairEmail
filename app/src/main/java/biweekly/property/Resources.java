package biweekly.property;

import java.util.List;

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
 * <p>
 * Defines a list of physical resources that are needed for an event or to-do
 * task (for example, a "projector" or "DVD player").
 * </p>
 * <p>
 * <b>Code sample:</b>
 * </p>
 * 
 * <pre class="brush:java">
 * VEvent event = new VEvent();
 * 
 * Resources resources = new Resources("projector", "DVD player");
 * event.addResources(resources);
 * </pre>
 * @author Michael Angstadt
 * @see <a href="http://tools.ietf.org/html/rfc5545#page-91">RFC 5545 p.91</a>
 * @see <a href="http://tools.ietf.org/html/rfc2445#page-87">RFC 2445 p.87-8</a>
 * @see <a href="http://www.imc.org/pdi/vcal-10.doc">vCal 1.0 p.34-5</a>
 */
public class Resources extends ListProperty<String> {
	/**
	 * Creates a new resources property.
	 */
	public Resources() {
		super();
	}

	/**
	 * Creates a new resources property.
	 * @param values the values to initialize the property with (e.g. "easel",
	 * "projector")
	 */
	public Resources(String... values) {
		super(values);
	}

	/**
	 * Creates a new resources property.
	 * @param values the values to initialize the property with (e.g. "easel",
	 * "projector")
	 */
	public Resources(List<String> values) {
		super(values);
	}

	/**
	 * Copy constructor.
	 * @param original the property to make a copy of
	 */
	public Resources(Resources original) {
		super(original);
	}

	@Override
	public String getAltRepresentation() {
		return super.getAltRepresentation();
	}

	@Override
	public void setAltRepresentation(String uri) {
		super.setAltRepresentation(uri);
	}

	@Override
	public String getLanguage() {
		return super.getLanguage();
	}

	@Override
	public void setLanguage(String language) {
		super.setLanguage(language);
	}

	@Override
	public Resources copy() {
		return new Resources(this);
	}
}
